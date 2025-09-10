 class SimpleWordCount {
    public static void main(String[] args) {
        String text = "The cat and the dog.";

        
        text = text.toLowerCase().replaceAll("[^a-z ]", "");

        
        String[] words = text.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            if (w.isEmpty()) continue;

            
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (words[j].equals(w)) {
                    seen = true;
                    break;
                }
            }
            if (seen) continue;

            
            int count = 1;
            for (int k = i + 1; k < words.length; k++) {
                if (words[k].equals(w)) {
                    count++;
                }
            }

            
            System.out.println(w + ": " + count);
        }
    }
}
