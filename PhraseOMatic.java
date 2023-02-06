import java.util.Random;

public class PhraseOMatic {
    public static void main(String[] args) {
        //make three sets of words to choose from. Add your own
        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible",
        "reactive", "agent based", "functional", "AI enabled", "strongly typed"};
        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven",
                "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless",
                "microservices", "distributed ledger"};
        String[] wordListTree = {"framework", "library", "DSL", "REST API", "repository", "pipeline",
                "service mesh", "architecture", "perspective", "design", "orientation"};

        //find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListTree.length;

        //generate three random numbers
        java.util.Random ramdomGenerator = new java.util.Random();
        int rand1 = ramdomGenerator.nextInt(oneLength);
        int rand2 = ramdomGenerator.nextInt(twoLength);
        int rand3 = ramdomGenerator.nextInt(threeLength);

        //now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListTree[rand3];

        //print out the phrase
        System.out.println("What we need is a " + phrase);
    }
}
