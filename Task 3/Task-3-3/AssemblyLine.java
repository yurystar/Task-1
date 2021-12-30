package com.senla.produce_auto;

public class AssemblyLine {
    final private ILineStep part1;
    final private ILineStep part2;
    final private ILineStep part3;
    final private IProduct installPart1;
    final private IProduct installPart2;
    final private IProduct installPart3;

    public AssemblyLine(ILineStep part1, ILineStep part2, ILineStep part3,
                        IProduct installPart1, IProduct installPart2, IProduct installPart3) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
        this.installPart1 = installPart1;
        this.installPart2 = installPart2;
        this.installPart3 = installPart3;
    }
    public void assembleProduct() {
        installPart1.installPart(part1.buildProductPart());
        installPart2.installPart(part2.buildProductPart());
        installPart3.installPart(part3.buildProductPart());
        System.out.println("Автомобиль собран.");
    }

    public static void main(String[] args) {
        ILineStep part1 = new CreateBodyAuto();
        ILineStep part2 = new CreateСhassisAuto();
        ILineStep part3 = new CreateEngineAuto();
        IProduct installPart1 = new InstallFirstPart();
        IProduct installPart2 = new InstallSecondPart();
        IProduct installPart3 = new InstallThirdPart();

        AssemblyLine createAuto = new AssemblyLine(part1, part2, part3,
                installPart1, installPart2, installPart3);
        createAuto.assembleProduct();
    }
}
