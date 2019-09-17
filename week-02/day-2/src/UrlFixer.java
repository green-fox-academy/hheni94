public class UrlFixer {
    public static void main(String[] args) {

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("bots" , "odds");
        url = url.replace("https//" , "https://");
        System.out.println(url);
    }
}
