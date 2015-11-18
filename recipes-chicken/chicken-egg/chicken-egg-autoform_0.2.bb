SECTION = "devel/chicken"
DESCRIPTION = "Generates HTML forms out of database structures"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://autoform.meta;md5=991c311070ca15afac80500b49b8b7bc"
DEPENDS_append_class-cross = " chicken-egg-sql-null-cross chicken-egg-html-tags-cross chicken-egg-html-utils-cross chicken-egg-spiffy-request-vars-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-sql-null-crosssdk chicken-egg-html-tags-crosssdk chicken-egg-html-utils-crosssdk chicken-egg-spiffy-request-vars-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-sql-null nativesdk-chicken-egg-html-tags nativesdk-chicken-egg-html-utils nativesdk-chicken-egg-spiffy-request-vars chicken-egg-sql-null-crosssdk chicken-egg-html-tags-crosssdk chicken-egg-html-utils-crosssdk chicken-egg-spiffy-request-vars-crosssdk"
DEPENDS = " chicken-egg-sql-null chicken-egg-html-tags chicken-egg-html-utils chicken-egg-spiffy-request-vars chicken-egg-sql-null-cross chicken-egg-html-tags-cross chicken-egg-html-utils-cross chicken-egg-spiffy-request-vars-cross"
RDEPENDS_${PN} = " chicken-egg-sql-null chicken-egg-html-tags chicken-egg-html-utils chicken-egg-spiffy-request-vars"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/autoform/autoform-${PV}.tar.gz"

SRC_URI[md5sum] = "a0d47f4e5ef2b6672b6668b2545b63f9"
SRC_URI[sha256sum] = "e28c6b5b5bb11467371f85b66217343757fad0d08d6ced364579ec4f5885d96f"

S = "${WORKDIR}/autoform-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
