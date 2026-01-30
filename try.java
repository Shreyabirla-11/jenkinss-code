public class HelloJenkins {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   Hello from the Jenkins Pipeline!   ");
        System.out.println("========================================");
        
        // Print runtime details
        String javaVersion = System.getProperty("java.version");
        long startTime = System.currentTimeMillis();
        
        System.out.println("Execution Status: SUCCESS");
        System.out.println("Running on Java version: " + javaVersion);
        System.out.println("Build Timestamp: " + startTime);
        System.out.println("========================================");
    }
}
