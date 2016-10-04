require_relative "../../src/year2016/pig_latin"

RSpec.describe "pig latin" do
  it "translates a single word beginning with a vowel" do
    expect(PigLatin.new.translate("eat")).to eq("eatway")
  end

  it "translates a single word beginning with a consonant" do
    expect(PigLatin.new.translate("cake")).to eq("akecay")
  end

  it "translates a single word beginning with two consonants" do
    expect(PigLatin.new.translate("chocolate")).to eq("ocolatechay")
  end

  it "translates a single word beginning with three consonants" do
    expect(PigLatin.new.translate("strange")).to eq("angestray")
  end

  it "translates two words in a sentence" do
    expect(PigLatin.new.translate("delicious cheese")).to eq("eliciousday eesechay")
  end

  it "translates words beginning in qu " do
    expect(PigLatin.new.translate("queen")).to eq("eenquay")
  end

  it "translates multiple words" do
    expect(PigLatin.new.translate("I am enjoying the conference")).to eq("Iway amway enjoyingway ethay onferencecay")
  end
end
