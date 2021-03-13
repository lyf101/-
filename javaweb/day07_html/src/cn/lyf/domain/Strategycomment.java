package cn.lyf.domain;

import java.util.Date;

/**
 * Date:2021/3/13 19:20
 * Author:lyf
 */
public class Strategycomment {
    private Long id;
    private Long user_id;
    private Date createTime;
    private String content;
    private String imgUrls;
    private int starNum;
    private Long strategy_id;
    private int state;
    private Date commentTime;

    @Override
    public String toString() {
        return "Strategycomment{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", createTime=" + createTime +
                ", content='" + content + '\'' +
                ", imgUrls='" + imgUrls + '\'' +
                ", starNum=" + starNum +
                ", strategy_id=" + strategy_id +
                ", state=" + state +
                ", commentTime=" + commentTime +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgUrls() {
        return imgUrls;
    }

    public void setImgUrls(String imgUrls) {
        this.imgUrls = imgUrls;
    }

    public int getStarNum() {
        return starNum;
    }

    public void setStarNum(int starNum) {
        this.starNum = starNum;
    }

    public Long getStrategy_id() {
        return strategy_id;
    }

    public void setStrategy_id(Long strategy_id) {
        this.strategy_id = strategy_id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Strategycomment(Long id, Long user_id, Date createTime, String content, String imgUrls, int starNum, Long strategy_id, int state, Date commentTime) {
        this.id = id;
        this.user_id = user_id;
        this.createTime = createTime;
        this.content = content;
        this.imgUrls = imgUrls;
        this.starNum = starNum;
        this.strategy_id = strategy_id;
        this.state = state;
        this.commentTime = commentTime;
    }
}
