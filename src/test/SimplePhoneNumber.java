package test;

public class SimplePhoneNumber
{
	private final String countryCode;
	private final String mobile;
	public final static SimplePhoneNumber NoNumber = new SimplePhoneNumber("","");

	public SimplePhoneNumber(String countryCode, String mobile)
	{
		this.countryCode = countryCode;
		this.mobile = mobile;
	}

	public String getCountryCode()
	{
		return countryCode;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof SimplePhoneNumber))
		{
			return false;
		}

		SimplePhoneNumber that = (SimplePhoneNumber) o;

		if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null)
		{
			return false;
		}
		if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null)
		{
			return false;
		}

		return true;
	}

	@Override
	public int hashCode()
	{
		int result = countryCode != null ? countryCode.hashCode() : 0;
		result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
		return result;
	}

	public String getMobile()
	{
		return mobile;
	}

	@Override
	public String toString()
	{
		return "SimplePhoneNumber{" +
				"countryCode='" + countryCode + '\'' +
				", mobile='" + mobile + '\'' +
				'}';
	}
}

