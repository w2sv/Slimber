package slimber

import android.util.Log

data class LogItem(val priority: Int, val tag: String?, val message: String, val t: Throwable?) {
  companion object {
    fun d(tag: String? = null, message: String = "", t: Throwable? = null) =
      LogItem(Log.DEBUG, tag, message, t)

    fun v(tag: String? = null, message: String = "", t: Throwable? = null) =
      LogItem(Log.VERBOSE, tag, message, t)

    fun w(tag: String? = null, message: String = "", t: Throwable? = null) =
      LogItem(Log.WARN, tag, message, t)

    fun e(tag: String? = null, message: String = "", t: Throwable? = null) =
      LogItem(Log.ERROR, tag, message, t)

    fun i(tag: String? = null, message: String = "", t: Throwable? = null) =
      LogItem(Log.INFO, tag, message, t)

    fun wtf(tag: String? = null, message: String = "", t: Throwable? = null) =
      LogItem(Log.ASSERT, tag, message, t)
  }
}
