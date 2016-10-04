require_relative "../../src/year2016/round_robin"

RSpec.describe "round robin" do
  it "pairs a single team with no one" do
    teams = ["Toronto Raptors"]
    expectedItinerary = { "Toronto Raptors" => ["no match"]}

    expect(RoundRobin.new.generateSchedule(teams)).to eq("eatway")
  end

  it "pairs two teams with eachother" do
    teams = ["Toronto Raptors", "Chicago Bulls"]
    expectedItinerary = {
      "Toronto Raptors" => ["Chicago Bulls"],
      "Chicago Bulls" => ["Toronto Raptors"]
    }

    expect(RoundRobin.new.generateSchedule(teams)).to eq("eatway")
  end

end
