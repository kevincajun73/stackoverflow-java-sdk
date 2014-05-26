package com.google.code.stackexchange.client.example;

import java.util.ArrayList;
import java.util.List;

import com.google.code.stackexchange.client.query.StackExchangeApiQueryFactory;
import com.google.code.stackexchange.common.PagedList;
import com.google.code.stackexchange.schema.Paging;
import com.google.code.stackexchange.schema.PostTimeline;
import com.google.code.stackexchange.schema.Question;
import com.google.code.stackexchange.schema.Range;
import com.google.code.stackexchange.schema.Revision;
import com.google.code.stackexchange.schema.StackExchangeSite;
import com.google.code.stackexchange.schema.User;

public class Hello {

	public static void main(String[] args) {
		StackExchangeApiQueryFactory queryFactory = StackExchangeApiQueryFactory
				.newInstance("", StackExchangeSite.STACK_OVERFLOW);
		Paging paging = new Paging(1, 100);
		String filter = "default";
		List<String> tag = new ArrayList<String>();
		tag.add("java");

		List<Revision> revisions = queryFactory.newRevisionApiQuery()
				.withPostIds(getIds("23859624,21404323")).list();
		System.out.println(revisions);
		/*
		 * List<Question> questions = queryFactory .newQuestionApiQuery()
		 * .withPaging(paging) .withFilter(filter)
		 * .withSort(Question.SortOrder.MOST_HOT) .withTags(tag) .withFilter(
		 * filter).list(); printQuestions(questions);
		 */

		System.out.println("Question by user ids ");
		long userId = 2384778;
		/*
		 * long userId = 2384778; List<Question> question2s =
		 * queryFactory.newQuestionApiQuery()
		 * .withPaging(paging).withFilter(filter)
		 * .withSort(Question.SortOrder.MOST_RECENTLY_CREATED)
		 * .withTags(tag).withUserIds(userId).listQuestionsByUser();
		 * 
		 * printQuestions(question2s);
		 */

		System.out.println("Question by answer ids ");
		long answerId = 21859130;
		/*
		 * long answerId = 21859130; List<Question> question3s =
		 * queryFactory.newQuestionApiQuery()
		 * .withPaging(paging).withFilter(filter)
		 * .withSort(Question.SortOrder.MOST_RECENTLY_CREATED)
		 * .withTags(tag).withAnswerIds(answerId).listQuestionsByAnswer();
		 * printQuestions(question3s);
		 */

		System.out.println("get Unanswered Questions");
		/*
		 * List<Question> question4s = queryFactory.newQuestionApiQuery()
		 * .withPaging(paging).withFilter(filter)
		 * .withSort(Question.SortOrder.MOST_RECENTLY_CREATED)
		 * .withTags(tag).listUnansweredQuestions(); printQuestions(question4s);
		 */

		System.out.println("get Favorite Questions");
		/*
		 * List<Question> question5s = queryFactory.newQuestionApiQuery()
		 * .withPaging(paging).withFilter(filter)
		 * .withSort(Question.SortOrder.MOST_RECENTLY_CREATED)
		 * .withTags(tag).withUserIds(userId).listFavoriteQuestions();
		 * printQuestions(question5s);
		 */

		System.out.println("get Similer Questions");
		String title = "How to design";
		/*
		 * List<Question> question6s = queryFactory.newQuestionApiQuery()
		 * .withPaging(paging).withFilter(filter)
		 * .withSort(Question.SortOrder.MOST_RELEVANT)
		 * .withTags(tag).withTitle(title).listSimilarQuestions();
		 * printQuestions(question6s);
		 */

		System.out.println("Search Questions");
		/*
		 * List<Question> question7s = queryFactory.newSearchApiQuery()
		 * .withInTitle(title).withTags(tag)
		 * .withSort(QuestionSortOrder.LEAST_RECENTLY_UPDATED).list();
		 * printQuestions(question7s);
		 */

		System.out.println("get Linked Questions");
		long questionId = 23845211;
		List<Long> questionIds = new ArrayList<Long>();
		questionIds.add(new Long(2807613));
		questionIds.add(new Long(11736681));
		/*
		 * List<Question> question8s = queryFactory.newQuestionApiQuery()
		 * .withTags(tag).withSort(Question.SortOrder.LEAST_VOTED)
		 * .withQuestionIds(questionIds).listLinkedQuestions();
		 * printQuestions(question8s);
		 */

		System.out.println("get Related Questions");
		/*
		 * List<Question> question9s = queryFactory.newQuestionApiQuery()
		 * .withTags(tag).withSort(Question.SortOrder.MOST_RANKED)
		 * .withQuestionIds(questionIds).listRelatedQuestions();
		 * printQuestions(question9s);
		 */

		System.out.println("get UnAnswered Questions");
		/*
		 * List<Question> question9s = queryFactory.newQuestionApiQuery()
		 * .withTags(tag).withSort(Question.SortOrder.MOST_VOTED)
		 * .listUnAnsweredQuestions(); printQuestions(question9s);
		 */

		System.out.println("get UnAnswered Questions posted By User");
		/*
		 * List<Question> question10s = queryFactory.newQuestionApiQuery()
		 * .withTags(tag).withSort(Question.SortOrder.MOST_VOTED)
		 * .withUserIds(userId).listUnAnsweredQuestionsByUser();
		 * printQuestions(question10s);
		 */

		System.out.println("get UnAccepted Questions posted By User");
		/*
		 * List<Question> question11s = queryFactory.newQuestionApiQuery()
		 * .withTags(tag).withSort(Question.SortOrder.MOST_VOTED)
		 * .withUserIds(userId).listUnAcceptedQuestionsByUser();
		 * printQuestions(question11s);
		 */

		System.out.println("get No-answer Questions posted By User");
		/*
		 * List<Question> question11s = queryFactory.newQuestionApiQuery()
		 * .withTags(tag).withSort(Question.SortOrder.MOST_VOTED)
		 * .withUserIds(userId).listQuestionsWithNoAnswerByUser();
		 * printQuestions(question11s);
		 */

		System.out
				.println("get Top Questions posted By User with the given tags");
		/*
		 * List<Question> question11s = queryFactory.newQuestionApiQuery()
		 * .withTags(tag).withSort(Question.SortOrder.MOST_VOTED)
		 * .withUserIds(userId).listTopQuestionsWithTagPostedByUser();
		 * printQuestions(question11s);
		 */

		System.out
				.println("Gets the FEATURED questions on which the users in {ids} have active bounties()");
		/*
		 * List<Question> question11s = queryFactory.newQuestionApiQuery()
		 * .withSort(Question.SortOrder.MOST_VOTED).withUserIds(userId)
		 * .listUserFeaturedQuestions(); printQuestions(question11s);
		 */

		System.out.println("Get UnAnswered Questions With User favoritetags");
		/*
		 * List<Question> question12s = queryFactory.newQuestionApiQuery()
		 * .withSort(Question.SortOrder.MOST_VOTED)
		 * .listUnansweredUserQuestionWithFavoriteTags();
		 * printQuestions(question12s);
		 */

		System.out
				.println("Gets the FEATURED questions which have active bounties()");
		/*
		 * List<Question> question12s = queryFactory.newQuestionApiQuery()
		 * .withSort(Question.SortOrder.MOST_VOTED).withUserIds(userId)
		 * .listFeaturedQuestions(); printQuestions(question12s);
		 */

		System.out.println("Gets Users with name");
		String name = "sanjiv";
		/*
		 * PagedList<User> user1s =
		 * queryFactory.newUserApiQuery().withName(name)
		 * .withSort(User.SortOrder.MOST_REPUTED).list(); printUsers(user1s);
		 */

		System.out.println("Gets Users by User Ids");
		/*
		 * PagedList<User> user2s = queryFactory.newUserApiQuery()
		 * .withUserIds(userId).withSort(User.SortOrder.MOST_REPUTED)
		 * .listUserByIds(); printUsers(user2s);
		 */

		System.out.println("Gets moderator Users ");
		/*
		 * PagedList<User> user3s = queryFactory.newUserApiQuery()
		 * .withSort(User.SortOrder.MOST_REPUTED).listModeratorUsers();
		 * printUsers(user3s);
		 */

		System.out.println("Gets moderator elected Users ");
		/*
		 * PagedList<User> user4s = queryFactory.newUserApiQuery()
		 * .withSort(User.SortOrder.MOST_REPUTED) .listModeratorElectedUsers();
		 * printUsers(user4s);
		 */

		System.out.println("Get user with AccessToken ");
		/*
		 * PagedList<User> user4s = queryFactory.newUserApiQuery()
		 * .withSort(User.SortOrder.MOST_REPUTED).listMe(); printUsers(user4s);
		 */

		System.out.println("Get Advance Search ");

		int minViews = 100;
		int minAnswers = 10;
		String filterName = "default";
		String query = "mongodb";

		List<String> tagged = new ArrayList<String>();
		tagged.add("java");
		tagged.add("mongodb");

		List<String> nottagged = new ArrayList<String>();
		nottagged.add("php");
		PagedList<Question> question13s = queryFactory
				.newAdvanceSearchApiQuery().withMinViews(100)
				.withAccepted(true).withClosed(true).withMigrated(true)
				.withMinViews(minViews).withMinAnswers(minAnswers)
				.withNotice(true).withFilter(filterName).withQuery(query)
				.withTags(tagged).withOutTags(nottagged).list();

		printQuestions(question13s);

		PagedList<Question> question14s = (PagedList<Question>) queryFactory
				.newQuestionApiQuery().listMyQuestions();
		System.out.println(question14s);
		printQuestions(question14s);

		System.out.println("Get posts ");
		Range range = new Range(1, 2);
		PagedList<PostTimeline> post1s = queryFactory.newPostApiQuery().list();
		System.out.println(post1s);
		printPosts(post1s);

		/*
		 * PagedList<Tag> list =
		 * queryFactory.newTagApiQuery().withPaging(paging)
		 * .withSort(Tag.SortOrder.LEAST_POPULAR).list();
		 * System.out.println(list);
		 * 
		 * PagedList<Answer> list2 = queryFactory.newAnswerApiQuery()
		 * .withPaging(paging)
		 * .withSort(Answer.SortOrder.LEAST_RECENTLY_CREATED)
		 * .listByQuestions(); System.out.println(list2);
		 */
	}

	private static void printPosts(PagedList<PostTimeline> posts) {
		System.out.println("######################################");
		System.out.println(posts);
		if (null != posts && posts.size() > 0) {
			for (PostTimeline post : posts) {
				System.out.println("{id='" + post.getPostId() + "',name='"
						+ post.getDisplayName() + "' }");
			}
		}
		System.out.println("######################################");
	}

	private static void printUsers(PagedList<User> users) {
		System.out.println("######################################");
		System.out.println(users);
		if (null != users && users.size() > 0) {
			for (User user : users) {
				System.out.println("{id='" + user.getUserId() + "',name='"
						+ user.getDisplayName() + "' }");
			}
		}
		System.out.println("######################################");
	}

	private static void printQuestions(List<Question> questions) {
		System.out.println("######################################");
		System.out.println(questions);
		if (null != questions && questions.size() > 0) {
			for (Question question : questions) {
				System.out.println("{id='" + question.getQuestionId()
						+ "',title='" + question.getTitle() + "' }");
			}
		}
		System.out.println("######################################");
	}

	protected static long[] getIds(String idString) {
		String[] tokens = idString.split(",");
		long[] ids = new long[tokens.length];
		for (int i = 0; i < tokens.length; i++) {
			ids[i] = Long.valueOf(tokens[i]);
		}
		return ids;
	}
}