package scala实用指南.FunctionValuesAndClosures

class Equipment(val routine: Int => Int) {
  def simulate(input: Int): Int = {
    print("Running simulation...")
    routine(input)
  }
}
