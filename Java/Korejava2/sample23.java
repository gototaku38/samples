public class sample23{
	public static void main(String[] args) {
		int i;
		for(i = 0; i < args.length; i++) {
			if(args[i].equals("skip")) { continue; } //ŽŸ‚ÌŒJ‚è•Ô‚µ‚Ö
			System.out.println("‘æ" + (i+1) + "ˆø”:" + args[i]);
			if(args[i].equals("end")) { break; } //ŒJ‚è•Ô‚µ‚ðI—¹
			}
	}
}
