SECTION = "devel/chicken"
DESCRIPTION = "Compute the longest common subsequence of two sequences"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://npdiff.meta;md5=498d48d915c72a22bac368a710138055"
DEPENDS_append_class-cross = " chicken-egg-datatype-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-datatype-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-datatype chicken-egg-datatype-crosssdk"
DEPENDS = " chicken-egg-datatype chicken-egg-datatype-cross"
RDEPENDS_${PN} = " chicken-egg-datatype"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/npdiff/npdiff-${PV}.tar.gz"

SRC_URI[md5sum] = "b777d493dcba0203da47745137b8fd4a"
SRC_URI[sha256sum] = "16b70ad1d9daa654710a9982612aae200222b98deda42b6212509a9ae5123122"

S = "${WORKDIR}/npdiff-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
