
public class Person {
	
     private int age;
	 private String name;
     private double weight;
     private double lenght;
         
     public Person(int age, String name, double weight, double lenght){
    	 this.age = age;
    	 this.name = name;
    	 this.weight = weight;
    	 this.lenght = lenght;
     }
     
     public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		if(weight > 0){
			this.weight = weight;
		}
	}


	public double getLenght() {
		return lenght;
	}


	public void setLenght(double lenght) {
		if(lenght > this.lenght){
			this.lenght = lenght;
		}
		else if (lenght < this.lenght && this.age >= 65){
			this.lenght = lenght;
		}
	}


	public String getName(){
    	 return name;
     }
     
     
     public int getAge() {
    	 return this.age;
		
	}
     

}
