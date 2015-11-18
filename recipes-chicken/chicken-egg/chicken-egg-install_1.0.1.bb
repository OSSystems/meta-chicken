SECTION = "devel/chicken"
DESCRIPTION = "install utilities"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://install.meta;md5=ad6115454341f1d908ed751b082e0487"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/install/install-${PV}.tar.gz"

SRC_URI[md5sum] = "cca8e8484fefdf66f281c76619130df2"
SRC_URI[sha256sum] = "f670d51d256ad0d205b09c59c275b50c742a5a9d960bd4f95d633ae3d342d846"

S = "${WORKDIR}/install-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
