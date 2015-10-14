require_relative '../src/same_arrays'

RSpec.describe "same arrays" do
  it "should return true for two empty arrays" do
    @first_array = Array.new
    @second_array = Array.new
    @is_equal = is_equal?(@first_array, @second_array)
    expect(@is_equal).to be_truthy
  end
end