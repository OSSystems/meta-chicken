SECTION = "devel/chicken"
DESCRIPTION = "posix-utils"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://posix-utils.meta;md5=761b607bbcfec0fc1dc9d662cb173a42"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/posix-utils/posix-utils-${PV}.tar.gz"

SRC_URI[md5sum] = "5febbe800ac7a07049e7f3906aafaa14"
SRC_URI[sha256sum] = "9bdef612057ae6d90198e3be306f49110852363eb27adc39c1c57c6aa861e40a"

S = "${WORKDIR}/posix-utils-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
