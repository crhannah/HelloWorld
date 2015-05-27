package com.crhannah.helloworld;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4640727409774176139L;

	private String header;
	private Random rnd;

	/*
	 *  Most of the following are from http://www.wiseoldsayings.com/humorous1.htm and are only used for didactic purposes
	 */
	private String[] sayings = {
			"Better a witty fool than a foolish wit. - Shakespeare",
			"A balanced diet is a cookie in each hand. - unknown",
			"A blonde said, \"I was worried that my mechanic might try to rip me off. I was relieved when he told me all I needed was turn signal fluid. - courtesy of Jack Shea, jshumor@exis.net",
			"A bulldog can whip a skunk, but sometimes it's not worth it. - J. Nowell",
			"A clean house is a sign of a misspent life. - unknown",
			"A clear conscience is usually the sign of a bad memory. - unknown",
			"A closed mouth gathers no feet. - Sam Horn",
			"A deaf husband and a blind wife are always a happy couple. - John Florio (1553-1625)",
			"A diplomat is one who thinks twice before saying nothing. - unknown",
			"A flatterer never seems absurd: the flatter'd always takes his word. - Ben Franklin (1706-1790)",
			"A friend in need is a pest. - Arthur Daley in the popular 1980's British sitcom, \"Minder\" - thanks to Rob",
			"A husband is someone who takes out the trash and gives the impression he just cleaned the whole house. - unknown",
			"A man must serve his time in every trade except censure-critics are ready made. - Lord Byron (1788-1824)",
			"A man's got to do what a man's got to do. A woman must do what he can't. - Rhonda Hansome",
			"A solemn, unsmiling, sanctimonious old iceberg who looked like he was waiting for a vacancy in the Trinity. - Mark Twain",
			"A teacher\'s job is to take a room full of live wires and make sure they are well grounded. - unknown (submitted by fubar@nque.com)",
			"Age is a very high price to pay for maturity. - unknown",
			"All the world is mad save for me and thee, and sometimes I wonder about thee. - Old Quaker saying - special thanks to the reader who replied to our query.",
			"All would live long but none would be old. - Ben Franklin (1706-1790)",
			"An apple a day keeps the doctor away, but an onion a day keeps everyone away. - Cassandra Chatfield",
			"An old woman in a nursing home lifted her dress and shouted \"supersex, supersex!\" every time she came upon an old gentleman. Finally she did this again in front of an old man who hesitated and said finally, \"I'll have soup.\" - unknown",
			"Anyone who doesn't think there are two sides to an argument is probably in one. - unknown",
			"Beer is proof that God loves us and wants us to be happy. - Ben Franklin (1706-1790)",
			"Before you criticize someone, walk a mile in his shoes. That way if he gets angry, he'll be a mile away and barefoot. - unknown",
			"Being young is a fault that diminishes daily. - Swedish (on youth and age)",
			"Blessed is he that can laugh at himself, he will never cease to be amused. - unknown",
			"Blessed is he that expects nothing, for he shall never be dissapointed. - Ben Franklin (1706-1790)" };

	public void init() throws ServletException {
		header = "Two servlets walked into a bar...";
		rnd = new Random();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<h1>" + header + "</h1>");
		out.println("<p>" + sayings[rnd.nextInt(sayings.length - 1)] + "</p>");
		out.println("<h5>" +
				new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(Calendar.getInstance().getTime())
//				+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
				+ "</h5>");
	}

	public void destroy() {
		// do nothing.
	}
}