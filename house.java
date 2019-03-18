public class house{
  double totarea,output;
  Scanner s=new Scanner(System.in());
  //Enter total area of house in square meters
  totarea=s.nextDouble();
  //Enter material standard required to build the  house
  //s=if required  is-standard material
  //h=if required is-high standard material
  //f=if required is- high standard material and fully automated home
   //Enter material standard required to build the  house
   char ms= s.next().charAt(0);
   switch(ms)
        {
            case 's':
            	output =(1200*1500*totarea);
                break;
            case 'h':
            	output = (1200*1800*totarea);
                break;
            case 'f':
            	output = (1200*2500*totarea);
                break;
            default:
                return;
        }
