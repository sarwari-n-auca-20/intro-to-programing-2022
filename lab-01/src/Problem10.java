public class Problem10 {
    public static void main(String[] args) {
      final int POPULATION = 312_032_486;
      final int SEC_IN_YEAR = 365 * 24 * 60 * 60;

      double birth = SEC_IN_YEAR / 7.0;
      double death = SEC_IN_YEAR / 13.0;
      double migration = SEC_IN_YEAR / 45.0;
      double yearlyPopulationGrowth = birth + migration -death;

      int pop1stYear = (int) Math.round(POPULATION + yearlyPopulationGrowth);
      int pop2ndYear = (int) Math.round(POPULATION + 2 * yearlyPopulationGrowth);
      int pop3rdYear = (int) Math.round(POPULATION + 3 * yearlyPopulationGrowth);
      int pop4thYear = (int) Math.round(POPULATION + 4 * yearlyPopulationGrowth);
      int pop5thYear = (int) Math.round(POPULATION + 5 * yearlyPopulationGrowth);

        System.out.println(pop1stYear + "\n" +
                pop2ndYear + "\n" +
                pop3rdYear + "\n" +
                pop4thYear + "\n" +
                pop5thYear)
        ;
//        final int POPULATION = 312_032_486;
//        final int  SEC_IN_YEAR = 365 * 24 * 60 * 60;
//
//        double birth = SEC_IN_YEAR / 7.0;
//        double death = SEC_IN_YEAR / 13.0;
//        double migration = SEC_IN_YEAR / 45.0;
//        double yearlyPopulationGrowth = birth - death + migration;
//        int popInt1Year = (int) Math.round(POPULATION +yearlyPopulationGrowth);
//        int popInt2Year = (int) Math.round(POPULATION + yearlyPopulationGrowth * 2);
//        int popInt3Year = (int) Math.round(POPULATION + yearlyPopulationGrowth * 3);
//        int popInt4Year = (int) Math.round(POPULATION + yearlyPopulationGrowth * 4);
//        int popInt5Year = (int) Math.round(POPULATION + yearlyPopulationGrowth * 5);
//
//        System.out.println(
//                popInt1Year + "\n" +
//                        popInt2Year + "\n" +
//                        popInt3Year + "\n" +
//                        popInt4Year + "\n" +
//                        popInt5Year
//        );
        }
    }
