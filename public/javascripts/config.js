var config = {
  debug: false,
  title: 'Devoxx UK 2013',

  search: 'from:@devoxx OR #devoxxuk OR devoxx.co.uk OR devoxx OR devoxx2013',

  timings: {
    defaultNoticeHoldTime: '10s',
    showTweetsEvery: '3s'
  }
};

// allows reuse in the node script
if (typeof exports !== 'undefined') {
  module.exports = config;
} 
