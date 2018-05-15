package com.lingzg.util.transformer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.transform.ResultTransformer;

import com.lingzg.util.StringUtil;

public class StartWithCaseResultTransformer implements ResultTransformer {

	private static final long serialVersionUID = -6868377196529580759L;

	@SuppressWarnings("rawtypes")
	@Override
	public List transformList(List data) {
		return data;
	}

	@Override
	public Object transformTuple(Object[] data, String[] colmsNames) {
		Map<String, Object> objMap=new HashMap<String, Object>();
		for(int i=0;i<colmsNames.length;i++){
			objMap.put(StringUtil.toStartWithLowerCase(colmsNames[i]), data[i]);
		}
		return objMap;
	}

}
