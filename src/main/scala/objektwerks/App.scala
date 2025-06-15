package objektwerks

import dev.langchain4j.model.openai.OpenAiChatModel

@main def runApp(): Unit =
  val apiKey = sys.env("OPENAI_API_KEY")
  val modelName = "gpt-4o-mini"

  val model = OpenAiChatModel
    .builder()
    .apiKey(apiKey)
    .modelName(modelName)
    .build()

  val answer = model.chat("Say 'Hello World'")
  println(s"Using OpenAI model, $modelName, to yield: $answer")