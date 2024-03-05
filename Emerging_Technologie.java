class Emerging_Technologie 
{
    private String prname;
    private String vprname;

    public Emerging_Technologie(String pr, String vpr ) 
    {
        this.prname = pr;
        this.vprname = vpr;
    }

    public void displayInfo() 
    {
        System.out.println("Emergicon: ");
        System.out.println("President: " + prname);
        System.out.println("Vice President: " + vprname);
    }
    public static void main(String[] args) 
    {
        AIML aimlTech = new AIML("Sujit Kirpan","maiyank", "abhishek barai");
        AIDS aidsTech = new AIDS("Sujit Kirpan", "Himanshu Talekar","Nupur Kuhite");
        
        Emerging_Technologie EM = new Emerging_Technologie("  "," ");
        EM.displayInfo();
        System.out.println();
        aimlTech.displayInfo();
        System.out.println();
        aidsTech.displayInfo();
    }
}


class AIML extends Emerging_Technologie 
{
    private String cr;

    public AIML(String name,String vname ,String crname) 
    {
        super(name,vname);
        this.cr = crname;
    }

    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Class Representative: " + cr );
    }
}


class AIDS extends Emerging_Technologie 
{
    private String crn;

    public AIDS(String name,String vname ,String crname) 
    {
        super(name,vname);
        this.crn = crname;
    }

    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Class Representation: " + crn);
    }
}

