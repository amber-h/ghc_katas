require_relative "../src/fibonacci"

RSpec.describe "fibonacci" do
  it "should return the first five numbers in the fibonacci sequence" do
    expect(Fibonacci.new.for_number(5)).to eq([1, 1, 2, 3, 5])
  end
end
