SECTION = "devel/chicken"
DESCRIPTION = "Serialize SXML to XML and HTML"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sxml-serializer.meta;md5=21608bfc133fd7611a075bba40eae49d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sxml-serializer/sxml-serializer-${PV}.tar.gz"

SRC_URI[md5sum] = "912165b1ee4102accedfd133afa5f713"
SRC_URI[sha256sum] = "2a99e8e964792a437702f95e79f548e405c205a19c23e0b8b0b26e52cc2d9c8e"

S = "${WORKDIR}/sxml-serializer-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
