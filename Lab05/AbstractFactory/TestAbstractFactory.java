public class TestAbstractFactory {
    public static void main(String[] args) {
        System.out.println("=== Testing Abstract Factory Pattern for Slot Machines ===\n");
        
        // Test Nevada Slot Factory
        System.out.println("--- Nevada Slot Factory ---");
        AbstractSlotFactory nvFactory = new NVSlotFactory();
        
        Slot nvStraight = nvFactory.createStraightSlot();
        System.out.println("Created: " + nvStraight.getName());
        nvStraight.collectParts();
        
        Slot nvBonus = nvFactory.createBonusSlot();
        System.out.println("Created: " + nvBonus.getName());
        nvBonus.collectParts();
        
        Slot nvProgressive = nvFactory.createProgressiveSlot();
        System.out.println("Created: " + nvProgressive.getName());
        nvProgressive.collectParts();
        
        System.out.println();
        
        // Test New Jersey Slot Factory
        System.out.println("--- New Jersey Slot Factory ---");
        AbstractSlotFactory njFactory = new NJSlotFactory();
        
        Slot njStraight = njFactory.createStraightSlot();
        System.out.println("Created: " + njStraight.getName());
        njStraight.collectParts();
        
        Slot njBonus = njFactory.createBonusSlot();
        System.out.println("Created: " + njBonus.getName());
        njBonus.collectParts();
        
        Slot njProgressive = njFactory.createProgressiveSlot();
        System.out.println("Created: " + njProgressive.getName());
        njProgressive.collectParts();
        
        System.out.println();
        
        // Test Washington Slot Factory
        System.out.println("--- Washington Slot Factory ---");
        AbstractSlotFactory wgFactory = new WGSlotFactory();
        
        Slot wgStraight = wgFactory.createStraightSlot();
        System.out.println("Created: " + wgStraight.getName());
        wgStraight.collectParts();
        
        Slot wgBonus = wgFactory.createBonusSlot();
        System.out.println("Created: " + wgBonus.getName());
        wgBonus.collectParts();
        
        Slot wgProgressive = wgFactory.createProgressiveSlot();
        System.out.println("Created: " + wgProgressive.getName());
        wgProgressive.collectParts();
        
        System.out.println("\n=== Abstract Factory Pattern Test Complete ===");
    }
}
