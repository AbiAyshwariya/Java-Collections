package Collections;
public class StudentMarks implements Comparable<StudentMarks>{
    private int maths;
    private int physics;
    @Override
    public String toString(){
        return "StudentMarks[maths="+maths+", physics: "+physics+"]";
    }

    public int getMaths(){
     return maths;
    }    

    public int getPhysics(){
        return physics;
    }

    public StudentMarks(int physics, int maths){
        this.physics=physics;
        this.maths=maths;
    }

    @Override
    public int compareTo(StudentMarks o) {
        // current object<other object 
        //     return -1
        // current object>other object 
        //     return 1
        // current object == other object 
        //     return 0
        int state=0;
        if (this.maths<o.maths){
            state=-1;
        }
        if (this.maths>o.maths){
            state= 1;
        }
        if (this.maths==o.maths){
            state= 0;
        }
        return state;
    }
    @Override
    public int hashCode(){
        final int prime=31;
        int result=1;
        result=prime*result+maths;
        result=prime*result+physics;
        return result;
    }

    @Override
    public boolean equals(Object obj){
      if(this==obj){
        return true;
      }
      if(obj==null){
        return false;
      }
      if(getClass()!=obj.getClass()){
        return false;
      }
      StudentMarks other = (StudentMarks)obj;
      if(maths!=other.maths){
        return false;
      }
     return true;
    }
} 
