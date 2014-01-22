package test;

import com.google.myjson.Gson;

import java.util.ArrayList;



import java.lang.reflect.Type;
import java.util.List;

public class JsonUtils
{
	public static <T> List<T> convertToList(String json, Class<T> className, Type type)
	{
		if (json == null || json.isEmpty())
		{
			return new ArrayList<T>();
		}
		else
		{
			Gson gson = new Gson();
			return gson.fromJson(json, type);
		}
	}

	public static <T> String convertFromList(List<T> list, Class<T> className, Type type)
	{
		if (list == null || list.isEmpty())
		{
			return "";
		}
		else
		{
			Gson gson = new Gson();
			return gson.toJson(list, type);
		}
	}

	@Deprecated
	public static <T> List<T> convertToList(String list, Class<T> className, String inputDelimiter)
	{
		List<T> extract = new ArrayList<T>();
		if (list != null && !list.equals(""))
		{
			Gson gson = new Gson();
			for (String entry : list.split(inputDelimiter))
			{
				T t = gson.fromJson(entry, className);
				if (t != null)
				{
					extract.add(t);
				}
			}
		}
		return extract;
	}
}

