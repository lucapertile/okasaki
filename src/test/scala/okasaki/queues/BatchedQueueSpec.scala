package okasaki.queues

import okasaki.{IntElements, QueueSpec}

/**
 * Copyright (C) 2015 Kamchatka Ltd
 */
class BatchedQueueSpec
  extends QueueSpec(new BatchedQueue[Int])
  with IntElements
