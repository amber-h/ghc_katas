class Minesweeper

  #TODO - write it again, but cleaner code
  class Board
    attr_accessor :height, :width, :tiles, :mines

    def initialize(height, width)
      @height = height
      @width = width
      @tiles = Array.new(height) { Array.new(width) }
    end

    def build_board(mines)
      rows = mines.split("\n")

      @height.times do |x|
        each_row = rows[x].strip
        markers = each_row.split('')
        @width.times do |y|
          if markers[y] == '*'
            @tiles[x][y] = '*'
            increment_surrounding_tiles(x, y)
          else
            if @tiles[x][y].nil?
              @tiles[x][y] = 0
            end
          end

        end
      end

    end

    def increment_surrounding_tiles(x, y)
      (x-1..x+1).each do |i|
        (y-1..y+1).each do |j|
          if i>=0 && j>=0 && i <@height && j< @width
            unless @tiles[i][j] == '*'
              @tiles[i][j] = @tiles[i][j] ? @tiles[i][j]+1 : 1
            end
          end
        end
      end

    end

  end

end
