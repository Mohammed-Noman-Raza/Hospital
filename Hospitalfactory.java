package HospitalDAO;

public class Hospitalfactory
{
 public Hospitalinterface createinstance(){
 return new Hospital();
 }
}