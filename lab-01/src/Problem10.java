public class Problem10 {
    public static void main(String[] args) {
        final int POPULATION = 312_032_486;
        final int  SEC_IN_YEAR = 365 * 24 * 60 * 60;

        double birth = SEC_IN_YEAR / 7.0;
        double death = SEC_IN_YEAR / 13.0;
        double migration = SEC_IN_YEAR / 45.0;
        double yearlypopulationgrowth = birth - death + migration;
        int popInt1Year = (int) Math.round(POPULATION +yearlypopulationgrowth);
        int popInt2Year = (int) Math.round(POPULATION + yearlypopulationgrowth * 2);
        int popInt3Year = (int) Math.round(POPULATION + yearlypopulationgrowth * 3);
        int popInt4Year = (int) Math.round(POPULATION + yearlypopulationgrowth * 4);
        int popInt5Year = (int) Math.round(POPULATION + yearlypopulationgrowth * 5);

        System.out.println(
                popInt1Year + "\n" +
                        popInt2Year + "\n" +
                        popInt3Year + "\n" +
                        popInt4Year + "\n" +
                        popInt5Year
        );
        }
    }
