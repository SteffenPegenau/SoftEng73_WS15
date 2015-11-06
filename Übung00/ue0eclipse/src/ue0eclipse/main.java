package ue0eclipse;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static boolean isInitValueValid(int v) {
		if ((v < Integer.MIN_VALUE) || (v > Integer.MAX_VALUE)) {
			return false;
		}
		return true;
	}

	/**
	 * Returns true if this attribute set contains the given attribute.
	 *
	 * @param attribute
	 *            value whose presence in this attribute set is to be tested.
	 *
	 * @return true if this attribute set contains the given attribute value.
	 */
	public boolean containsValue(Attribute attribute) {
		return attribute != null && attribute instanceof Attribute
				&& attribute.equals(attrMap.get(((Attribute) attribute).getCategory()));
	}

	public static void main(String[] args) {
		int i = Integer.MIN_VALUE * 2;
		boolean valid = isInitValueValid(i);
		System.out.println(i + ":" + valid);
	}

}
