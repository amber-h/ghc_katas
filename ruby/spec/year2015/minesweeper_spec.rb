require_relative "../../src/year2015/minesweeper"

RSpec.describe "minesweeper" do
  it "should return a translated string for a mine" do
    expect(Minesweeper.new.solve("*")).to eq("*")
  end
end
