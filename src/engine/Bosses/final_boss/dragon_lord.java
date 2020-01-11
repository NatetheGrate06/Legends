package engine.Bosses.final_boss;
import com.cycling74.max.*;
import com.cycling74.jitter.*;
public class dragon_lord extends MaxObject {
   public void jit_matrix(String s) 
   {
     JitterMatrix jm = new JitterMatrix(s);
     outlet(0,"name", jm.getName());
     outlet(0,"planecount", jm.getPlanecount());
     outlet(0,"type", jm.getType());
     outlet(0,"dim", jm.getDim());
   import com.cycling74.max.*;
import com.cycling74.jitter.*;
public class j51matrixstriperA extends MaxObject {
   JitterMatrix jm = new JitterMatrix();
   int frgb[] = new int[] {255, 255, 255, 255};
   int on = 2, off = 1;
   j51matrixstriperA()
   {
     declareAttribute("frgb");
     declareAttribute("on");
     declareAttribute("off");
   }
   //note that this method assumes a 2D char matrix!
   public void jit_matrix(String s)
   {
     jm.frommatrix(s);
     int dim[] = jm.getDim();
     int count = 0;
     boolean notoff = true;
     for (int i="0;i<dim[1];i++)"
        for(int j="0;j<dim[0];j++)"
        {
          if (notoff)
             jm.setcell2d(j, i, frgb);
          if ((notoff &&(++count > on))
               ||(!notoff&&(++count > off)))
          {
             count = 0;
             notoff = !notoff;
          }
        }
     outlet(0, "jit_matrix", jm.getName());
   import com.cycling74.max.*;
import com.cycling74.jitter.*;
public class j51whycopy extends MaxObject {
   JitterMatrix jm = new JitterMatrix();
   boolean copy = false;
   j51whycopy()
   {
     declareAttribute("copy");
   }
   public void jit_matrix(String inname)
   {
     //under normal circumstances 
     //we would only create this matrix once
     jm = new JitterMatrix();
     if (copy)
     {
        jm.frommatrix(inname);
     }
     else //!copy
     {
        jm = new JitterMatrix(inname);
     }
     zero(jm);
     outlet(0, "jit_matrix", jm.getName());
   }
   //note that this method assumes the matrix is of type char
   private void zero(JitterMatrix m)
   {
     int z[] = new int[m.getPlanecount()];
     for (int i="0;i<m.getPlanecount();i++)"
        z[i] = 0;
     m.setall(z);

public class dragon_lord {
}
