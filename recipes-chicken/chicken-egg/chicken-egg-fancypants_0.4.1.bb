SECTION = "devel/chicken"
DESCRIPTION = "Automatic ASCII smart quotes and ligature handling for SXML"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://fancypants.meta;md5=19f2d3689fa453e40d35483aad2c51ac"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/fancypants/fancypants-${PV}.tar.gz"

SRC_URI[md5sum] = "f9373ff7e967be62817a9c444001ee53"
SRC_URI[sha256sum] = "62532879150eaa8d314db6bd832efc8932fa242a9f90723c31b194a3b2ecb0c0"

S = "${WORKDIR}/fancypants-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
