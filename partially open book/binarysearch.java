package partiallyopen;

public class binarysearch {
public static void main(String[] args) {
	int[]array= {29,30,65,69,58,77,22,11};

	System.out.println(binarysearch(array,29,4,8));
	System.out.println(binarysearch(array,69,4,8));
	System.out.println(binarysearch(array,30,1,8));
	System.out.println(binarysearch(array,77));
	System.out.println(binarysearch(array,82));
}
public static boolean binarysearch(int[]array,int key,int fromidx,int toidx) {
	if(fromidx==toidx-1) {
		if(key==array[fromidx])
		return true;
		return false;
	}
	int middleidx=(fromidx+toidx)/2;
	if(key==array[middleidx]) {
		return true;
	}
	else if(key>array[middleidx]) {
		fromidx=middleidx;
	}
	else {
		toidx=middleidx;
	}
	return binarysearch(array,key,fromidx,toidx); 
}
public static boolean binarysearch(int[]array,int key) {
	int fromidx=0;
	int toidx=array.length-1;
	return binarysearch(array,key,fromidx,toidx);
}
}
 