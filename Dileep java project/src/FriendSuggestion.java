mport java.util.*;

public class FriendSuggestion {

    static Map<String, List<String>> network = new HashMap<>();

    public static List<String> suggestFriends(String person, int maxSuggestions) {
        Map<String, Integer> mutualCount = new HashMap<>();
        Set<String> directFriends = new HashSet<>(network.getOrDefault(person, new ArrayList<>()));

        for (String friend : directFriends) {
            for (String foaf : network.getOrDefault(friend, new ArrayList<>())) {
                if (!foaf.equals(person) && !directFriends.contains(foaf)) {
                    mutualCount.put(foaf, mutualCount.getOrDefault(foaf, 0) + 1);
                }
            }
        }

        // Sort by number of mutual friends, descending
        List<String> suggestions = new ArrayList<>(mutualCount.keySet());
        suggestions.sort((a, b) -> mutualCount.get(b) - mutualCount.get(a));

        // Limit to maxSuggestions
        return suggestions.subList(0, Math.min(maxSuggestions, suggestions.size()));
    }

    public static void main(String[] args) {
        // Sample network
        network.put("Alice", Arrays.asList("Bob", "Charlie"));
        network.put("Bob", Arrays.asList("Alice", "David", "Eve"));
        network.put("Charlie", Arrays.asList("Alice"));
        network.put("David", Arrays.asList("Bob"));
        network.put("Eve", Arrays.asList("Bob"));

        System.out.println("Suggestions for Alice: " + suggestFriends("Alice", 3));
    }
}
