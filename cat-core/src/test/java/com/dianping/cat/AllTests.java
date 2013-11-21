package com.dianping.cat;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.dianping.cat.analysis.AbstractMessageAnalyzerTest;
import com.dianping.cat.analysis.PeriodStrategyTest;
import com.dianping.cat.message.spi.core.HtmlMessageCodecTest;
import com.dianping.cat.message.spi.core.MessagePathBuilderTest;
import com.dianping.cat.message.spi.core.TcpSocketReceiverTest;
import com.dianping.cat.message.spi.core.WaterfallMessageCodecTest;
import com.dianping.cat.service.ModelRequestTest;
import com.dianping.cat.service.ModelResponseTest;
import com.dianping.cat.statistic.ServerStatisticManagerTest;
import com.dianping.cat.storage.dump.LocalMessageBucketManagerTest;
import com.dianping.cat.storage.dump.LocalMessageBucketTest;
import com.dianping.cat.storage.report.LocalReportBucketTest;
import com.dianping.cat.task.TaskManagerTest;

@RunWith(Suite.class)
@SuiteClasses({

HtmlMessageCodecTest.class,

WaterfallMessageCodecTest.class,

/* .storage.dump */
LocalMessageBucketTest.class,

LocalMessageBucketManagerTest.class,

/* .storage.report */
LocalReportBucketTest.class,

/* .task */
TaskManagerTest.class,

TcpSocketReceiverTest.class,

MessagePathBuilderTest.class,

ServerStatisticManagerTest.class,

PeriodStrategyTest.class,

ModelRequestTest.class,

ServerConfigManagerTest.class,

AbstractMessageAnalyzerTest.class,

ModelResponseTest.class
})
public class AllTests {

}
