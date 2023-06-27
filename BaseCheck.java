
//fa19
public class BaseCheck {

	public static void main(String[] args) {
        String seqA1 = "ATCGATTGAGCTCTAGCG";
		String seqB1 = "TAGCTAACTCGAGATCGC";
		if (!base_check(seqA1, seqB1)) {
            System.out.println("FAILED TEST 1");
            System.exit(1);
		}
        
		String seqA2 = "ATCGATGGAGCTGTAGCG";
		String seqB2 = "TAGCTAACTCGAGATCGA";
		if (base_check(seqA2, seqB2)) {
            System.out.println("FAILED TEST 2");
            System.exit(1);
		}
        
		String seqA3 = "ATCGATTGAGCT";
		String seqB3 = "TAGCTAACTCGAGATCGC";
		if (base_check(seqA3, seqB3)) {
            System.out.println("FAILED TEST 3");
            System.exit(1);
		}
		
        String seqA4 = "ATCGATTGAGCTCTAGCG";
		String seqB4 = "TAGCTAACTCGAGATC";
		if (base_check(seqA4, seqB4)) {
            System.out.println("FAILED TEST 4");
            System.exit(1);
		}
        
		String seqA5 = "ATCGATTGAGCTCTAGCG";
		String seqB5 = "ATCGATTGAGCTCTAGCG";
		if (base_check(seqA5, seqB5)) {
            System.out.println("FAILED TEST 5");
            System.exit(1);
		}
        
		String seqA6 = "GGGG";
		String seqB6 = "CCCC";
		if (!base_check(seqA6, seqB6)) {
			System.out.println("FAILED TEST 6");
			System.exit(1);
		}
		String seqA7 = "";
		String seqB7 = "";
		if (base_check(seqA7, seqB7)) {
			System.out.println("FAILED TEST 7");
			System.exit(1);
		}
        
        /* We will test your code on additional test
        cases, so make sure it really works. (e.g., you can
        add more of your own test cases, just copy one of the
		above ones and modify it).
        */
        
        System.out.println("Tests pass for base_check");
    }
    
    public static boolean base_check(String seq1, String seq2) {
		if (seq1.length() != seq2.length()) {
			return false;
		}
		else if (seq1 == seq2){
			return false;
		}
		for (int i=0; i<seq1.length(); i++) {
			if (seq1.charAt(i) == 'A' && seq2.charAt(i) != 'T') {
				return false;
			}
			if (seq1.charAt(i) == 'T' && seq2.charAt(i) != 'A') {
				return false;
			}
			if(seq1.charAt(i) == 'C' && seq2.charAt(i) != 'G') {
				return false;
			}
			if(seq1.charAt(i) == 'G' && seq2.charAt(i) != 'C') {
				return false;
			}
		}
		return true;
    }
}
