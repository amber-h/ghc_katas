require_relative "../../src/year2016/sum_square_difference"

RSpec.describe "sum square difference" do

  it "finds sum square difference of 0 numbers" do
    expect(SumSquareDifference.new.findDifference(0).to eq(0))
  end

  it "finds sum square difference of 2 numbers" do
    expect(SumSquareDifference.new.findDifference(2).to eq(4))
  end

  it "finds sum square difference of 10 numbers" do
    expect(SumSquareDifference.new.findDifference(10).to eq(2640))
  end

end
