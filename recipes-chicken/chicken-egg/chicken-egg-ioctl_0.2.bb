SECTION = "devel/chicken"
DESCRIPTION = "ioctl system call interface"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ioctl.meta;md5=9b8ee016dee06817c492cb4bceb72123"
DEPENDS_append_class-cross = " chicken-egg-foreigners-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-foreigners-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-foreigners chicken-egg-foreigners-crosssdk"
DEPENDS = " chicken-egg-foreigners chicken-egg-foreigners-cross"
RDEPENDS_${PN} = " chicken-egg-foreigners"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ioctl/ioctl-${PV}.tar.gz"

SRC_URI[md5sum] = "661a91ab7615c3fe8337d4ba985b2979"
SRC_URI[sha256sum] = "fb3bfe0300f1d68154a77cc129102f0bd816f1166baba5267f6c28176aebf1b3"

S = "${WORKDIR}/ioctl-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
