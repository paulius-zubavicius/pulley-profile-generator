package owr.d3.generator.pulley.tooth.profile;

import owr.d3.generator.pulley.utils.DiameterCalc;

public class ProfileHTD8 implements IToothProfile {

	@Override
	public double getToothDepth() {
		return 3.607;
	}

	@Override
	public double getToothWidth() {
		return 6.603;
	}

	@Override
	public double calcOutsideDiameter(int teeth) {
		return DiameterCalc.getPulleyOutsideDiameter(teeth, 8, 0.6858);
	}

	@Override
	public double[][] getProfileVertexes() {
		return new double[][] { { -3.301471, -1 }, { -3.301471, 0 }, { -3.16611, 0.012093 }, { -3.038062, 0.047068 },
				{ -2.919646, 0.10297 }, { -2.813182, 0.177844 }, { -2.720989, 0.269734 }, { -2.645387, 0.376684 },
				{ -2.588694, 0.496739 }, { -2.553229, 0.627944 }, { -2.460801, 1.470025 }, { -2.411413, 1.691917 },
				{ -2.343887, 1.905691 }, { -2.259126, 2.110563 }, { -2.158035, 2.30575 }, { -2.041518, 2.490467 },
				{ -1.910478, 2.66393 }, { -1.76582, 2.825356 }, { -1.608446, 2.973961 }, { -1.439261, 3.10896 },
				{ -1.259169, 3.22957 }, { -1.069074, 3.335006 }, { -0.869878, 3.424485 }, { -0.662487, 3.497224 },
				{ -0.447804, 3.552437 }, { -0.226732, 3.589341 }, { -0.000176, 3.607153 }, { 0.226511, 3.589461 },
				{ 0.447712, 3.552654 }, { 0.66252, 3.497516 }, { 0.870027, 3.424833 }, { 1.069329, 3.33539 },
				{ 1.259517, 3.229973 }, { 1.439687, 3.109367 }, { 1.608931, 2.974358 }, { 1.766344, 2.825731 },
				{ 1.911018, 2.664271 }, { 2.042047, 2.490765 }, { 2.158526, 2.305998 }, { 2.259547, 2.110755 },
				{ 2.344204, 1.905821 }, { 2.411591, 1.691983 }, { 2.460801, 1.470025 }, { 2.553229, 0.627944 },
				{ 2.588592, 0.496739 }, { 2.645238, 0.376684 }, { 2.720834, 0.269734 }, { 2.81305, 0.177844 },
				{ 2.919553, 0.10297 }, { 3.038012, 0.047068 }, { 3.166095, 0.012093 }, { 3.301471, 0 },
				{ 3.301471, -1 } };
	}

}
