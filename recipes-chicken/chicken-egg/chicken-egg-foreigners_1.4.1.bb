SECTION = "devel/chicken"
DESCRIPTION = "Foreign helper macros for Chicken 4"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://foreigners.meta;md5=c207c0505eab1b907b43de637c70de81"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/foreigners/foreigners-${PV}.tar.gz"

SRC_URI[md5sum] = "ef0b3f50a84809ff30a1a8569ca28166"
SRC_URI[sha256sum] = "1a790214490042b9ac72560bfe77965257e13489be9a834f750ce666c02abc1f"

S = "${WORKDIR}/foreigners-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
