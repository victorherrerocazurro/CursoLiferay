package com.ejemplo;

import com.liferay.portal.kernel.search.BaseIndexerPostProcessor;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.model.User;

public class MiUserIndexer extends BaseIndexerPostProcessor {

	@Override
	public void postProcessDocument(Document document, Object obj)
			throws Exception {

		User user = (User)obj;
		
		String jobTitle = user.getJobTitle();
		
		document.addText(Field.TITLE, jobTitle);
		
		super.postProcessDocument(document, obj);
	}
	
}
