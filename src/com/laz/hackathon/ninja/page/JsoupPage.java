package com.laz.hackathon.ninja.page;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupPage {
	private Document document;

	public JsoupPage(String url) throws IOException {
		this.document = Jsoup.connect(url).get();
	}

	protected Document getDocument() {
		return document;
	}

}
