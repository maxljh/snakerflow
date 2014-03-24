/* Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.snaker.engine.job;

import java.util.List;

import org.snaker.engine.entity.Task;

/**
 * 任务job执行后的回调类
 * @author yuqs
 * @since 1.4
 */
public interface JobCallback {
	/**
	 * 回调函数
	 * @param curTask 当前任务对象
	 * @param newTasks 新产生的任务集合
	 */
	void callback(Task curTask, List<Task> newTasks);
}