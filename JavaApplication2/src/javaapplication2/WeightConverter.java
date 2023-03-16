public class WeightConverter {
   public static double convertWeight(String from, String to, double amount) {
      // Define the conversion factors for each unit
      final double KG_TO_G = 1000;
      final double KG_TO_LBS = 2.20462;
      final double LBS_TO_KG = 0.453592;
      final double G_TO_KG = 0.001;
      
      // Convert to a common unit (kg)
      double kgAmount;
      switch (from) {
         case "kg":
            kgAmount = amount;
            break;
         case "g":
            kgAmount = amount * G_TO_KG;
            break;
         case "lbs":
            kgAmount = amount * LBS_TO_KG;
            break;
         default:
            return 0;
      }
      
      // Convert to the target unit
      switch (to) {
         case "kg":
            return kgAmount;
         case "g":
            return kgAmount / G_TO_KG;
         case "lbs":
            return kgAmount * KG_TO_LBS;
         default:
            return 0;
      }
   }
}