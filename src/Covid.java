import java.util.Scanner;
public class Covid{
    public static void main(String[] args)
    {
        System.out.println("Contact Tracing Program");
        System.out.println("Enter a newly infected person's information");
        System.out.println("What is a patient's name?");
        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.nextLine();
        Person p=new Person();
        p.setName(name);
        System.out.println("What is a patient's phone number? ");
        p.ph=sc.nextLine();
        p.setPh(p.ph);
        System.out.println("What is a patient's email?");
        p.email=sc.nextLine();
        p.setEmail(p.email);
        System.out.println("What city does a patient live in?");
        p.address=sc.nextLine();
        p.setAddress(p.address);
        System.out.println("What state does a patient live in?");
        String state = sc.next();
        p.setState(state);
        System.out.println("Does person have any symptom for Cough? (y/n)");



        char c = sc.next().charAt(0);
        if(c =='y')
        {
            Symptom sym=new Symptom();
            String var="cough";
            sym.setSymptom("cougn");
            System.out.println("How long has  person  had this symptom for?");
            int bc=sc.nextInt();
            sym.setdays(bc);

        }

        System.out.println("Does person have any symptom for Shortness of breath or difficulty breathing? (y/n)");
        char c1 = sc.next().charAt(0);
        if(c1 =='y')
        {
            Symptom sym=new Symptom();
            String var="Shortness of Breath";
            sym.setSymptom(var);
            System.out.println("How long has  person  had this symptom for?");
            int bc=sc.nextInt();
            sym.setdays(bc);

        }


        System.out.println("Does person have any symptom for  Tiredness (y/n)");
        char c2 = sc.next().charAt(0);
        if(c2 =='y')
        {
            Symptom sym=new Symptom();
            String var="Tiredness";
            sym.setSymptom(var);
            System.out.println("How long has  person  had this symptom for?");
            int bc=sc.nextInt();
            sym.setdays(bc);

        }

        System.out.println("Does person have any symptom for   Aches (y/n)");
        char c3 = sc.next().charAt(0);
        if(c3 =='y')
        {
            Symptom alp=new Symptom();
            String var="Aches";
            alp.setSymptom(var);
            System.out.println("How long has  person  had this symptom for?");
            int bc=sc.nextInt();
            alp.setdays(bc);

        }

        System.out.println("Does person have any symptom for Chills (y/n)");
        char c4 = sc.next().charAt(0);
        if(c4 =='y')
        {
            Symptom alp=new Symptom();
            String var="Chills";
            alp.setSymptom(var);
            System.out.println("How long has  person  had this symptom for?");
            int bc=sc.nextInt();
            alp.setdays(bc);

        }

        System.out.println("Does person have any symptom for Sore throat (y/n)");
        char c5 = sc.next().charAt(0);
        if(c5 =='y')
        {
            Symptom sym=new Symptom();
            String var="Sore throat";
            sym.setSymptom(var);
            System.out.println("How long has  person  had this symptom for?");
            int bc=sc.nextInt();
            sym.setdays(bc);

        }
        System.out.println("Does person have any symptom for Loss of smell (y/n)");
        char c6 = sc.next().charAt(0);
        if(c6 =='y')
        {
            Symptom sym=new Symptom();
            String var="Loss of smell";
            sym.setSymptom(var);
            System.out.println("How long has  person  had this symptom for?");
            int bc=sc.nextInt();
            sym.setdays(bc);

        }

        System.out.println("Does person have any symptom for Loss of taste (y/n)");
        char c7 = sc.next().charAt(0);
        if(c7 =='y')
        {
            Symptom sym=new Symptom();
            String var="Loss of taste";
            sym.setSymptom(var);
            System.out.println("How long has  person  had this symptom for?");
            int bc=sc.nextInt();
            sym.setdays(bc);

        }

        System.out.println("Does person have any symptom for Headache (y/n)");
        char c8 = sc.next().charAt(0);
        if(c8 =='y')
        {
            Symptom sym=new Symptom();
            String var="Headache";
            sym.setSymptom(var);
            System.out.println("How long has  person  had this symptom for?");
            int bc=sc.nextInt();
            sym.setdays(bc);

        }

        System.out.println("Does person have any symptom for  Diarrhea (y/n)");
        char c9 = sc.next().charAt(0);
        if(c9 =='y')
        {
            Symptom sym=new Symptom();
            String var=" Diarrhea";
            sym.setSymptom(var);
            System.out.println("How long has  person  had this symptom for?");
            int bc=sc.nextInt();
            sym.setdays(bc);

        }
        //
        System.out.println("Does person have any symptom for  Severe vomiting (y/n)");
        char c10 = sc.next().charAt(0);
        if(c10 =='y')
        {
            Symptom symlp=new Symptom();
            String var="Severe vomiting";
            symlp.setSymptom(var);
            System.out.println("How long has  person  had this symptom for?");
            int bc=sc.nextInt();
            symlp.setdays(bc);

        }












    }
}