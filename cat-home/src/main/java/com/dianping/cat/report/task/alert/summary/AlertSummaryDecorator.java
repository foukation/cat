package com.dianping.cat.report.task.alert.summary;

import com.dianping.cat.home.alert.summary.entity.AlertSummary;

public interface AlertSummaryDecorator {
	public String generateHtml(AlertSummary alertSummary);
}
