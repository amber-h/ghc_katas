RSpec.describe "minesweeper" do

  describe 'Minesweeper::Board.increment_surrounding_tiles' do
    it 'should increase surrounding tiles by 1 for one row' do
      board = Minesweeper::Board.new(1, 4)
      board.tiles = [['*', 0, 0, 0]]

      board.increment_surrounding_tiles(0, 0)

      expect(board.tiles).to eq([['*', 1, 0, 0]])
    end

    it 'should increase surrounding tiles by 1 for two rows' do
      board = Minesweeper::Board.new(2, 4)
      board.tiles = [['*', 0, 0, 0],
                     [0, 0, 0, 0]]

      board.increment_surrounding_tiles(0, 0)

      expect(board.tiles).to eq([['*', 1, 0, 0],
                                 [1, 1, 0, 0]])
    end

    it 'should increase surrounding tiles by 1 for two rows on right' do
      board = Minesweeper::Board.new(2, 4)
      board.tiles = [[0, 0, 0, '*'],
                     [0, 0, 0, 0]]

      board.increment_surrounding_tiles(0, 3)

      expect(board.tiles).to eq([[0, 0, 1, '*'],
                                 [0, 0, 1, 1]])
    end
  end

  describe 'Minesweeper::Board.build_board' do

    it 'should build board with one row' do
      mines = '*...'


      board = Minesweeper::Board.new(1, 4)
      board.build_board(mines)

      expect(board.tiles).to eq([['*', 1, 0, 0]])

    end

    it 'should build board with two rows' do
      mines = <<-eos
          *...
          ..*.
      eos

      board = Minesweeper::Board.new(2, 4)
      board.build_board(mines)

      expect(board.tiles).to eq([['*', 2, 1, 1], [1, 2, '*', 1]])

    end


    it 'should build board with two rows' do
      mines = <<-eos
          *...
          ..*.
          ....
      eos

      board = Minesweeper::Board.new(3, 4)
      board.build_board(mines)

      expect(board.tiles).to eq([['*', 2, 1, 1],
                                 [1, 2, '*', 1],
                                 [0, 1, 1, 1]])

    end
  end


end